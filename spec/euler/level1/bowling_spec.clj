(ns euler.level1.bowling-spec
  (:use
    [speclj.core]
    [euler.level1.bowling])
  (:import (euler.level1.bowling Game))
  (:import (euler.level1.bowling Frame)))

(describe "Bowling Game"

  (it "The score function must iterate through all the frames, and calculate all their scores."
    (should= 0 (score (new-game)))
    (should= 3 (score (Game. [(Frame. 1) (Frame. 2)])))
    )

  (it "rolls all zeroes"
    (let [game (reduce (fn [cum _] (roll cum 0) (new-game)) (range 20))]
      (should= 0 (score game))
      )
    )

  (it "rolls all ones"
    (let [game (reduce (fn [cum _] (roll cum 1) (new-game)) (range 20))]
      (should= 0 (score game))
      )
    )

  )

(run-specs)
