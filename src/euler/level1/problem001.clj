(ns euler.level1.problem001)

(defn multiple-of-3-or-5? [n]
  (or (zero? (mod n 3)) (zero? (mod n 5)))
  )

(defn euler-1 [n]
  (->> (range n)
       (filter multiple-of-3-or-5?)
       (apply +)))
