(ns app-sheeps.pages.misc
  (:require [app-sheeps.pages.misc-content :refer [misc-items]]))

(defn misc-page []
    [:div.vh-100.flex.flex-row.flex-wrap.
     (for [item misc-items]
      [:div.ba.bw1.h-25.w-auto.ma1
       [:section.f2.avenir (item :title)]
       [:section (item :type)]
       [:section [:a {:href (item :link)} (item :title)]]
       [:div "Tags"
        (for [tag (:tags item)]
          [:section [:span.ma1 tag]])]])])
