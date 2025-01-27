(ns euler.level1.problem002)

(defn euler-2 [n]
  (if (>= 2 n)
    n
    (+ (euler-2 (- n 2)) (euler-2 (- n 1)))
    )
  )
