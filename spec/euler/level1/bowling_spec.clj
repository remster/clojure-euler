(ns euler.level1.bowling-spec
  (:use
    [speclj.core]
    [euler.level1.bowling])
  (:import (euler.level1.bowling Game)))

(describe "Bowling Game"

  (it "finds multiples of 3 and 5"
    (should= false (multiple-of-3-or-5? 1))
    (should= 7 (get-pins (Game.)))
    )
  )

(run-specs)
