(ns cars-assemble)

(defn success-ratio
  [speed]
  (cond
    (== speed 0) 0.0
    (<= 1 speed 4) 1.0
    (<= 5 speed 8) 0.9
    (== 9 speed) 0.8
    (== 10 speed) 0.77))

(defn production-rate
  "Returns the assembly line's production rate per hour,
   taking into account its success rate"
  [speed]
  (* (* speed 221) (success-ratio speed)))
  ;; (int (* (* speed 221) (success-ratio speed))))

(defn working-items
  "Calculates how many working cars are produced per minute"
  [speed]
  (int (/ (production-rate speed) 60)))
