;; Palindrome Detector - Easy
;; Write a function which returns true if the given sequence is a palindrome.<br/><br>
;;                Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
;; tags - seqs
;; restricted - 
(ns offline-4clojure.p27
  (:use clojure.test))

(defn __ [l]
;; your solution here
  (loop [f l
         r (reverse l)]
    (if (and (nil? (first f)) (nil? (first r))) 
      true 
      (if (= (first r) (first f))  
        (recur (rest f) (rest r))  
        false)))
)

(defn -main []
  (are [soln] soln
(false? (__ '(1 2 3 4 5)))
(true? (__ "racecar"))
(true? (__ [:foo :bar :foo]))
(true? (__ '(1 1 3 3 1 1)))
(false? (__ '(:a :b :c)))
))
