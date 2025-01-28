(ns euler.level1.problem002-spec
  (:require
    [speclj.core :refer :all]
    [euler.level1.problem002 :refer :all]))

; https://projecteuler.net/problem=2

(describe "Euler Problem #2"

  (it "fib"
    (should= '(1) (fib 1))
    (should= '(1 2) (fib 2))
    (should= '(1 2 3) (fib 3))
    (should= '(1 2 3 5) (fib 4))
    (should= '(1 2 3 5 8 13) (fib 6))
    (should= 3524578 (last (fib 32)))
    (should= 5702887 (last (fib 33)))
    )

  (it "euler-2"
    (should= 4613732 (euler-2 32))
    )

  )



(run-specs)
