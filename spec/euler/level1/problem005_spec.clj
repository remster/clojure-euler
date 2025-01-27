(ns euler.level1.problem005-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem005 :refer :all]))

; https://projecteuler.net/problem=5

(describe "Euler Problem #5"

  (it "Solves #5"
    (should= true (divisible 10 [2 5]))
    (should= false (divisible 10 [3 5]))
    (should= true (divisible 2520 [2 3 4 5 6 7 8 9 10]))
    (should= 2520 (euler-5 10))
    )
  )

(run-specs)
