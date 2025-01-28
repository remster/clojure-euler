(ns euler.level1.problem005)

(defn take-until
  "Returns a lazy sequence of successive items from coll until
   (pred item) returns true, including that item. pred must be
   free of side-effects."
  [pred coll]
  (lazy-seq
    (when-let [s (seq coll)]
      (if (pred (first s))
        (cons (first s) nil)
        (cons (first s) (take-until pred (rest s)))))))

(defn divisible? [o divisors]
  (if (= o 0)
    false
    (=
      (count divisors)
      (count
        (filter
          zero?
          (map
            (fn [divisor]
              (mod o divisor)) divisors)
          )
        )
      )
    )
  )


(defn euler-5 [n]
  (let [divisors (range 1 (+ n 1))]
    (last
      (take-until
        (fn [n]
          (divisible? n divisors))
        (iterate (fn [x] (+ x 210)) 0))
      )
    )
  )
