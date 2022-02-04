;; Maximum value - Easy
;; Write a function which takes a variable number of parameters and returns the maximum value.
;; tags - core-functions
;; restricted - max:max-key
(ns offline-4clojure.p38
  (:use clojure.test))

(defn __ [& args]
;; your solution here
;; solution uses sort
;; #(last (sort %&)) 🤦‍♂
  (loop [m -1
         l args]
    (if (> (count l) 0)
      (if (> (first l) m)
        (recur (first l) (rest l))
        (recur m (rest l)))
      m)))

(defn -main []
  (are [soln] soln
(= (__ 1 8 3 4) 8)
(= (__ 30 20) 30)
(= (__ 45 67 11) 67)
))
