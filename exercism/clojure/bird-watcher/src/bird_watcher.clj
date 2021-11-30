(ns bird-watcher)

(def last-week
  [0 2 5 3 7 8 4])

(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (conj (pop birds) (inc (last birds))))

(defn day-without-birds? [birds]
  (if (== 0 (count birds))
    false (if (== 0 (first birds))
            true
            (day-without-birds? (rest birds)))))

(defn n-days-count [birds n]
  (reduce + 0 (take n birds)))

(defn busy-days [birds]
  (reduce (fn [busy-count bird]
            (if (>= bird 5)
              (inc busy-count)
              busy-count)) 0 birds))


(defn odd-week-state [lastb birds]
  (if (== 0 (count birds))
    true
    (if (not (== 1 (bit-xor lastb (first birds))))
      false
      (odd-week-state (first birds) (rest birds)))))

(defn odd-week? [birds]
  (odd-week-state (first birds) (rest birds)))


