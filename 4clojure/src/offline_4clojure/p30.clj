;; Compress a Sequence - Easy
;; Write a function which removes consecutive duplicates from a sequence.
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p30
  (:use clojure.test))

(defn __ [n]
;; your solution here
   (loop [l n
          pure '()]
      (let [curr (first l)
            next (first (rest l))
            newL (rest l)]
        (if (= 0 (count l)) 
            (reverse pure) 
           (recur newL (if (= curr next) pure (conj pure curr)) )) ))
)

(defn -main []
  (are [soln] soln
(= (apply str (__ "Leeeeeerrroyyy")) "Leroy")
(= (__ [1 1 2 3 3 2 2 3]) '(1 2 3 2 3))
(= (__ [[1 2] [1 2] [3 4] [1 2]]) '([1 2] [3 4] [1 2]))
))
