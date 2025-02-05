(ns euler.level1.bowling)

(defn sum [nums]
  (reduce + nums))

(defn spare? [rolls]
  (= (sum (take 2 rolls)) 10))

(defn strike? [rolls]
  (= (first rolls) 10))

(defn ->frames [rolls]
  (if (empty? rolls)
    []
    (cons
      (if (or (spare? rolls) (strike? rolls))
        (take 3 rolls)
        (take 2 rolls))
      (lazy-seq (->frames (if (strike? rolls)
                            (drop 1 rolls)
                            (drop 2 rolls)))))))

(defn score [rolls]
  (sum (flatten (take 10 (->frames rolls)))))