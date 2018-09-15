; Return the hypotenuse of two given numbers as parameters
defn get-hypotenuse [a b]
  (Math/sqrt(+ (* a a) (* b b))))

(get-hypotenuse 3 4)
