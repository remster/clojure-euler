(ns euler.level1.problem004-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem004 :refer :all]))

; https://projecteuler.net/problem=4

(describe "Euler Problem #4"

  (it "palindrome?"
    (should= false (palindrome? 21))
    (should= true (palindrome? 1))
    (should= true (palindrome? 121)))

  (it "Solves #4"
    (should= 9009 (euler-4 2))
    (should= 906609 (euler-4 3))
    )
  )

(run-specs)
