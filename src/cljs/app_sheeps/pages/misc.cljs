(ns app-sheeps.pages.misc
  (:require [app-sheeps.pages.misc-content :refer [misc-items]]))


; we need an array of colors
; we need to randomly grab an index

(defn misc-page []
    [:main.cf.pa2
     [:div.vh-100.flex.flex-row.flex-wrap.ph2.ma1 
      (for [item misc-items]
       [:div.ba.bw1.h-30.w-auto.pv2.grow.dib.ma1 {:class (:bg item)}
        [:section.f2.avenir (item :title)]
        [:section.pa2 (item :type)]
        [:section.pa2 [:a {:href (item :link)} (item :title)]]
        [:blockquote.pa2.f2.ba.bw1 "Tags"
         (for [tag (:tags item)]
          [:span.ma1.f4 tag])]])]])
