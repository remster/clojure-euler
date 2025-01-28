(ns euler.level1.problem006)

(defn square [n]
  (Math/pow n 2))

(defn euler-6 [n]
  (let [r (map inc (range n))]
    (int (-
      (square
        (reduce + r))
      (reduce +
              (map square r)
              )
      )
    ))
  )
