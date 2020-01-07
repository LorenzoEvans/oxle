(ns app-sheeps.pages.misc
  (:require [app-sheeps.pages.misc-content :refer [misc-items]]))


; we need an array of colors
; we need to randomly grab an index
(def colors ["bg-washed-green" "bg-washed-blue" "bg-near-white" "bg-washed-red" "bg-washed-yellow"])
(def c-count (count colors))
(def r-idx (rand-int (+ c-count 1)))
(def color-choice (get colors r-idx))
(js/console.log color-choice)
(defn misc-page []
    [:main.cf.pa2
     [:div.vh-100.flex.flex-row.flex-wrap.ph2.ma1 
      (for [item misc-items]
       [:div.ba.bw1.h-30.w-auto.pv2.grow.dib.ma1 {:class color-choice}
        [:section.f2.avenir (item :title)]
        [:section.pa2 (item :type)]
        [:section.pa2 [:a {:href (item :link)} (item :title)]]
        [:blockquote.pa2.f2.ba.bw1 "Tags"
         (for [tag (:tags item)]
          [:span.ma1.f4 tag])]])]])
