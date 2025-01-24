(ns euler.level1.problem001-spec
  (:use
    [speclj.core]
    [euler.level1.problem001]))

; http://projecteuler.net/index.php?section=problems&id=1

(describe "Euler Problem #1"

  (it "finds multiples of 3 and 5"
    (should= false (multiple-of-3-or-5? 1))
    (should= true (multiple-of-3-or-5? 3))
    (should= true (multiple-of-3-or-5? 10))
    )

  (it "Solves #1"
    (should= 23 (euler-1 10))
    (should= 3 (euler-1 4))
    (should= 8 (euler-1 6))
    (should= 33 (euler-1 11))
    ;(should= -1 (euler-1 1000))
    )
  )

(run-specs)
