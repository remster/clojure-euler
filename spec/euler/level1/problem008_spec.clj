(ns euler.level1.problem008-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem008 :refer :all]))

; https://projecteuler.net/problem=8

(describe "Euler Problem #8"

  (it "segment-by-digits"
    (should= "7316" (first (segment-by-digits 4)))
    (should= "3167" (second (segment-by-digits 4)))
    (should= "3450" (last (segment-by-digits 4)))
    )

  (it "digits-product"
    (should= (* 2 3 4) (digits-product 234))
    )

  (it "Solves #8"
    (should= 5832 (euler-8 4))
    (should= 23514624000 (euler-8 13))
    )
  )

(run-specs)
