(ns euler.level1.bowling-spec
  (:use
    [speclj.core]
    [euler.level1.bowling]))

(defn roll-many [game iterations pins]
  (reduce (fn [cum _] (roll cum pins)) game (range iterations))
  )

(describe "Bowling Game"


  (it "rolls all zeroes"
    (let [game (roll-many (new-game) 20 0)]
      (should= 0 (score game))
      )
    )

  (it "rolls all ones"
    (let [game (roll-many (new-game) 20 1)]
      (should= 20 (score game))
      )
    )

  ;(it "one spare"
  ;  (let [game
  ;        (-> (new-game)
  ;            (roll 5)
  ;            (roll 5)
  ;            (roll 3)
  ;            (roll-many 17 0)
  ;            )]
  ;    (should= 16 (score game))
  ;    )
  ;  )

  )

(run-specs)
