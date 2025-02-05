(ns euler.level1.bowling-spec
  (:use
    [speclj.core]
    [euler.level1.bowling]))

(describe "Bowling Game "

  (it "gutter game - no pins scores 0"
    (should= 0 (score (repeat 0))))

  (it "all 1s - score is sum of pins"
    (should= 20 (score (repeat 1))))

  (it "spare adds the next roll"
    (should= 16 (score [4 6 3])))

  (it "strike add next two rolls"
    (should= 16 (score [10 1 2])))

  (it "perfect game - all strikes"
    (should= 300 (score (repeat 10))))

  (it "->frames"
    (should= [] (->frames []))
    (should= [[1]] (->frames [1]))
    (should= [[1 2][3 4]] (->frames [1 2 3 4]))
    (should= [[4 6 3][3]] (->frames [4 6 3]))
    (should= [[10 1 2][1 2]] (->frames [10 1 2])))
  )

(run-specs)
