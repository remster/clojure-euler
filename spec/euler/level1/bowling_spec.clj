(ns euler.level1.bowling-spec
  (:use
    [speclj.core]
    [euler.level1.bowling])
  (:import (euler.level1.bowling Game)))

(describe "Bowling Game"

  (it "Plays Game"
    (let [game (Game.)
          bowlingGame (BowlingGame 1 2)]
      (should= 7 (score game))
      (roll "bar" "baz")
      (roll bowlingGame 8)
      )
    )
  )

(run-specs)
