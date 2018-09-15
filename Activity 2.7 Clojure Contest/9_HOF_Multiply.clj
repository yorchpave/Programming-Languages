; Create HOF that multiplies 2 numbers

(defn multiplier [n]
  (fn [x]
    (* n x)
  )
)
((multiplier 5) 20)
