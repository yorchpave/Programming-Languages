; Calculate a tank volume and area, l = length, w = width, h = height.

; Calculate area of tank with a rectanlge base
(defn area-rectangle [length width]
    (* length width))

; Calculate volume of tank with a rectanlge base
(defn volume-rectangle [length width height]
    (* length width height))

; Calculate area of tank with a triangle base
(defn area-triangle [length width]
    (/ (* length width) 2))

; Calculate volume of tank with a triangle base
(defn volume-triangle [length width height]
    (*(/ (* length width) 2) height))

"AREA RECTANGLE"    
(area-rectangle 2 3)
"VOLUME RECTANGLE"
(volume-rectangle 2 3 4)

"AREA TRIANGLE"    
(area-triangle 2 3)
"VOLUME TRIANGLE"
(volume-triangle 2 3 4)
