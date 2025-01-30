(ns euler.level1.bowling)

(defn multiple-of-3-or-5? [n]
  (or (zero? (mod n 3)) (zero? (mod n 5)))
  )

(defn euler-1 [n]
  (->> (range n)
       (filter multiple-of-3-or-5?)
       (apply +)))

(defrecord Game [])
(defmulti get-pins class)
(defmethod get-pins Game [game] 7)