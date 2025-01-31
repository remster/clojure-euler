(ns euler.level1.bowling-spec
  (:use
    [speclj.core]
    [euler.level1.bowling])
  (:import (euler.level1.bowling Game))
  (:import (euler.level1.bowling Frame)))

(describe "Bowling Game"

  (it "Calculates Score"
    (should= 0 (score (new-game)))
    (should= 3 (score (Game. [(Frame. 1) (Frame. 2)])))
    )
  )

(run-specs)
