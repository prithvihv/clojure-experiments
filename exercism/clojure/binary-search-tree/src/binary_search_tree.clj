(ns binary-search-tree)

(defn value [m] ;; <- arglist goes here
  ;; your code goes here
  (get m :data))


(defn singleton [data] ;; <- arglist goes here
  ;; your code goes here
  {:data data :left nil :right nil})


(defn insert [d, t] ;; <- arglist goes here
  ;; your code goes here
  (cond
    (nil? t) (singleton d)
    (> d (value t)) (assoc t :right (insert d (t :right)))
    :else (assoc t :left (insert d (t :left)))))
  

(defn left [t] ;; <- arglist goes here
  ;; your code goes here
  (t :left))


(defn right [t] ;; <- arglist goes here
  ;; your code goes here
  (t :right))


(defn to-list [t] ;; <- arglist goes here
  ;; your code goes here
  (let [l (left t)
        r (right t)
        v (value t)]
    (concat
            (when l (to-list l))
            (if v [v] v)
            (when r (to-list r))))
)


(defn from-list [arr] ;; <- arglist goes here
  ;; your code goes here
  (reduce (fn [t d] (insert d t)) (singleton (first arr)) (rest arr)))

