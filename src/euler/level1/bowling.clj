(ns euler.level1.bowling)

(defrecord Game [frames current-roll])
(defn new-game []
  (Game.
    (vec
      (map
        (fn [_] 0)
        (range 21)))
    0))

(defn iteration-score [frames i]
  (let [consecutive-sum (+ (nth frames i) (nth frames (+ i 1)))]
    (if (= consecutive-sum 10)
      (+ 10 (nth frames (+ i 2)))
      consecutive-sum
      )
    )
  )
(defn score [game]
  (reduce
    +
    (map (fn [i] (iteration-score (:frames game) (* 2 i))) (range 10))))

(defn roll [game pins]
  (Game.
    (map-indexed
      (fn [i frame]
        (if (= (:current-roll game) i)
          (+ pins frame)
          frame
          )) (:frames game)),
         (inc (:current-roll game)))
  )