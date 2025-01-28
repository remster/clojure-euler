(ns euler.level1.problem002)


(defn fib [n]
  (->> [0 1]
       (iterate (fn [[a b]] [b (+ a b)]))
       (map first)
       (drop 2)
       (take n)))

(defn euler-2 [n]
  (reduce + (filter even? (fib n)))
  )
