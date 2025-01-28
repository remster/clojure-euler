(ns euler.level1.problem006)



(defn euler-6 [n]
  (let [r (map inc (range n))]
    (int (-
      (Math/pow ; square of
        (reduce + r) ; sum
        2)
      (reduce + ;sum of
              (map (fn [n] (Math/pow n 2)) r); squares
              )
      )
    ))
  )
