;; Fibonacci Sequence - Easy
;; Write a function which returns the first X fibonacci numbers.
;; tags - Fibonacci:seqs
;; restricted - 
(ns offline-4clojure.p26
  (:use clojure.test))

(defn __ [n]
;; your solution here
  (loop [i 0
         prevFib1 0
         prevFib2 1
         fib ()]
    (if (= i n)
      (reverse fib)
      (let [currFib (+ prevFib1 prevFib2)]
        (recur
         (+ i 1)
         currFib
         prevFib1
         (conj fib currFib))))))

(defn -main []
  (are [soln] soln
(= (__ 3) '(1 1 2))
(= (__ 6) '(1 1 2 3 5 8))
(= (__ 8) '(1 1 2 3 5 8 13 21))
))
