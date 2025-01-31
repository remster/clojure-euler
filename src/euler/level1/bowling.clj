(ns euler.level1.bowling)

(defrecord Frame [score])

(defrecord Game [frames current-roll])
(defn new-game []
  (Game.
    (vec
      (map
        (fn [_] (Frame. 0))
        (range 21)))
    0))

(defn frame-score [frame] (:score frame)) ; little sad that there can't be typed based function overloading https://github.com/ertugrulcetin/overload-fn
(defn score [game]
  (reduce + (map frame-score (:frames game))))

(defn roll [game pins]
  (Game.
    (map-indexed
      (fn [i frame]
        (if (= (:current-roll game) i)
          (Frame. (+ pins (:score frame)))
          frame
          )) (:frames game)),
         (inc (:current-roll game)))
  )