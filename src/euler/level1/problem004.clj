(ns euler.level1.problem004)

(defn is-palindrome [s]
  (let [len (count s)
        last (dec len)]
    (if (<= len 1)
      true
      (and
        (= (get s 0) (get s last))
        (is-palindrome (subs s 1 last))
        )
      )
    )
)

(defn products-of-n-digit-numbers [n]
  (let [
        n-digit-nos
        (range
          (int (Math/pow 10 (- n 1)))
          (int (Math/pow 10 n)))]
    (flatten
      (map (fn [x]
             (map (fn [y] (* x y)) n-digit-nos)
             ) n-digit-nos)
      )
    )
  )

(defn euler-4 [n]
  (let [
      n-digit-nos
      (range
        (int (Math/pow 10 (- n 1)))
        (int (Math/pow 10 n)))]
  (reduce
    max
    (filter
      (fn [n]
        (is-palindrome (str n))
        )
      (products-of-n-digit-numbers n)
      )
    )
  )
)
