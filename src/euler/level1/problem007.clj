(ns euler.level1.problem007
  (:require
    [euler.level1.problem005 :refer :all])
  )

(defn prime? [n]
  (let [divisors (range 2 n)]
    (empty?
      (filter
        zero?
        (map
          (fn [divisor]
            (mod n divisor)) divisors)
        )
      )
    )
  )

(defn next-prime [n]
  (inc
    (or
      (last
        (take-while (fn [n] (not (prime? n)))
            (iterate inc (inc n)))
        )
        n
      )
    )
  )

(defn euler-7 [n]
  (last (take n (iterate
            next-prime 2)))
  )
