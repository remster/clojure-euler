(ns euler.level1.bowling)

(defrecord Frame [score])

(defrecord Game [frames])
(defn new-game [] (Game. []))

(defn frame-score [frame] (:score frame))
(defn score [game] (reduce + (map frame-score (:frames game))))