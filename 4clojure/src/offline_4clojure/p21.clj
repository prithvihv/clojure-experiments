;; Nth Element - Easy
;; Write a function which returns the Nth element from a sequence.
;; tags - seqs:core-functions
;; restricted - nth
(ns offline-4clojure.p21
  (:use clojure.test))

(defn __ [l e]
;; your solution here
  (loop [i 0
         l l]
     (if (= i e)
       (first l)
       (recur (+ i 1) (rest l))))
) 
  
  
  

(defn -main []
  (are [soln] soln
    (= (__ '(4 5 6 7) 2) 6)
    (= (__ [:a :b :c] 0) :a)
    (= (__ [1 2 3 4] 1) 2)
    (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
    ))
 
