(ns art.core
  (:require [quil.core :as q]
            [quil.middleware]))

(defn setup []
  0)

(defn update-state [n]
  n)

(defn draw [n]
  )


(q/defsketch example
  :title "Art!"
  :middleware [quil.middleware/fun-mode]
  :settings #(q/smooth 2)
  :setup setup
  :update update-state
  :draw draw
  :size [540 350]
  ; :size [1080 720]
  )
