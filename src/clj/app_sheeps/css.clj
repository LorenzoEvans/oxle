(ns app-sheeps.css
  (:require [garden.def :refer [defstyles]]
            [garden.core :refer [css]]))

(defstyles screen
  [:body {:color "red"}])

(def h1
  (css [:h1 {:font-size "11px" :text "green"}]))