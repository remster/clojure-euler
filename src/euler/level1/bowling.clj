(ns euler.level1.bowling)


(deftype Foo [a])
(defrecord Bar [c])

(def f (Foo. 1))
(.-a f)

(def b (Bar. 1))
(:c b)

(defprotocol BowlingGame
  (roll [pins]))

(defrecord Game [frames]
  BowlingGame
  (roll [pins] (println "roll")))
(deftype Frame [rolls])
(deftype Roll [ball-1 ball-2])
(defmulti score class)
(defmethod score Game [game] 7)

(defn BowlingGame [x y]
  [(class x) (class y)])

(def foo (fn []))
(defn foo [])
(def a 1)

(defn roll [a b]
  (println a b))

(def roll [Long Long] [a b]
  (println (+ a b)))