(ns euler.level1.problem005)

(defn divisible [o divisors]
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


(defn euler-5 [n]
  (let [divisors (range 1 (+ n 1))
        largest (reduce * divisors)]
    (inc (last
      (take-while (fn [n] (not (divisible n divisors))) (iterate inc 1))
      )
    ))
  )
