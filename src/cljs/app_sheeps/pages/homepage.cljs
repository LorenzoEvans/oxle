  
(ns app-sheeps.pages.homepage
    (:require [app-sheeps.subs]))

(defn new-string [x]
    (clojure.string/replace x "." " "))

(def link-styling (new-string "h3.grow.avenir.no-underline.near-black.ba.bw1.f3.near-black.bg-near-white.w4.w-75-m.br1.shadow-3.flex.items-center.justify-center"))

(defn github-anchor [] [:a {:class link-styling :href "https://github.com/LorenzoEvans"} "Github"])
(defn twitter-anchor [] [:a {:class link-styling :href "https://twitter.com/0xLEDev"} "Twitter"])
(defn posts-anchor [] [:a {:class link-styling :href "#/posts"} "Posts"])
(defn misc-anchor [] [:a {:class link-styling :href "#/misc"} "Misc"])
(defn about-anchor [] [:a {:class link-styling :href "#/about"} "About"])
(defn portfolio-anchor [] [:a {:class link-styling :href "http://www.lorenzoevans.me/"} "Portfolio"])

(defn home-page []
      (fn []
       [:div.flex.flex-column.justify-around.flex-column-m.justify-around-m.b--near-black.bw2.bg-image.vh-100
        [:h1.flex.flex-column.justify-center.w-100.w-90-m.flex-column-m.bw2.avenir.dark-gray.f1.ba.b--near-black.bw1.shadow-3.f2-m.tc.self-center 
         [:div.w-100.flex.flex-row.justify-between.tracked-mega.h3-m [:span.f-subheadline.tracked-mega.f2-m "Maybe"] [:span.f-subheadline.tracked-mega.f2-m "Sheeps"]]]
        [:nav.w-100.items-center.flex.flex-row.justify-around.self-center.mt2.mb2.flex-column-m.justify-between-m.h-100-m
         [posts-anchor]
         [portfolio-anchor]
         [github-anchor]
         [twitter-anchor]
         [about-anchor]
         [misc-anchor]]
        [:div.flex.flex-column.br3.bw2.ba.b--near-black.tc.avenir.near-white.bg-near-black.f4.pa3.lh-copy.fw2.vh-50.self-center.w-75-m.shadow-3.dn-m.justify-between
         [:div.fw3.bb.bt.bw1.ma2.b--near-white. "A blog dedicated to *Functional Programming, and other niche and weird *tech things of my choosing."]
         [:div.fw3.bb.bw1.ma2.b--near-white "Yes, the name is from the 'Maybe Not' Rich Hickey talk."]
         [:div.f4.fw1.ba.bw1.ma2.b--near-white "* Manufactured on equipment that processes OOP: may contain imperative code & mutable state"]
         [:div.f4.fw1.ba.bw1.ma2.b--near-white " * may contain non-tech related things because this is my blog and my code is law here. "]]]))
  
