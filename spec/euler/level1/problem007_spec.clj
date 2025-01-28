(ns euler.level1.problem007-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem007 :refer :all]))

; https://projecteuler.net/problem=7

(describe "Euler Problem #7"

  (it "prime"
    (should= true (prime? 1))
    (should= true (prime? 2))
    (should= true (prime? 3))
    (should= false (prime? 4))
    (should= false (prime? 6))
    (should= false (prime? 9))
    )

  (it "next-prime"
    (should= 7 (next-prime 5))
    (should= 3 (next-prime 2))
    (should= 11 (next-prime 7))
    )

  (it "Solves #7"
    (should= 13 (euler-7 6))
    (should= 104743 (euler-7 10001))
    )

  )

(run-specs)
