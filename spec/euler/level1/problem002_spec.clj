(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "Solves #2"
    (should= 1 (euler-2 1))
    (should= 2 (euler-2 2))
    (should= 3 (euler-2 3))
    (should= 5 (euler-2 4))
    (should= 13 (euler-2 6))
    (should= 89 (euler-2 10))
    )
  )

(run-specs)
