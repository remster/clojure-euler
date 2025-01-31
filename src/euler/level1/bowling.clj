(ns euler.level1.bowling)

(defrecord Frame [score])

(defrecord Game [frames])
(defn new-game [] (Game. []))

(defn frame-score [frame] (:score frame)) ; little sad that there can't be typed based function overloading https://github.com/ertugrulcetin/overload-fn
(defn score [game] (reduce + (map frame-score (:frames game))))

(defn roll [game pins]
  (conj (:frames game) (Frame. pins))
  )