(ns euler.level1.problem003)

(defn smallest-factor [n]
  (
    first (filter
            (fn[x] (= (mod n x) 0))
            (iterate inc 2))
          )
  )

(defn factorize [n]
  (let [other (/ n (smallest-factor n))]
    (if (= other 1)
      n
      (factorize other)
      )
    )
  )

(defn euler-3 [n]
  (factorize n)
  )
