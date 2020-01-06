  
(ns app-sheeps.pages.homepage
    (:require [app-sheeps.subs]))

(defn new-string [x]
    (clojure.string/replace x "." " "))

(def link-styling-home (new-string "h3.pa1.grow.bw1.w-90.f3.near-white.bg-near-black.w4.w-75-m.br1.ba.b--near-white.shadow-3.flex.items-center.justify-center"))
(def link-styling-x (new-string "h3.grow.no-underline.near-black.ba.bw1.f3.near-black.bg-near-white.w4.w-75-m.br1.shadow-3.flex.items-center.justify-center"))

(defn github-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "https://github.com/LorenzoEvans"} "Github"])
(defn twitter-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "https://twitter.com/0xLEDev"} "Twitter"])
(defn posts-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "#/posts"} "Posts"])
(defn misc-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "#/misc"} "Misc"])
(defn about-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "#/about"} "About"])
(defn portfolio-anchor [] [:a.w-90.mono-gf {:class link-styling-home :href "http://www.lorenzoevans.me/"} "Portfolio"])

; (defn home-page []
;       (fn []
;        [:div.flex.flex-row.flex-column-m.justify-around-m.b--near-black.bw2.bg-image.vh-100
;         [:nav.w-100.items-center.flex.flex-column.justify-around.self-center.mt2.mb2.flex-column-m.justify-between-m.h-100-m]
;         [posts-anchor]
;         [portfolio-anchor]
;         [github-anchor]
;         [twitter-anchor]
;         [about-anchor]
;         [misc-anchor]
;         [:h1.justify-center.w-50.w-90-m.flex-column-m.bw2.avenir.dark-gray.f1.ba.b--near-black.bw1.shadow-3.f2-m.tc.self-center 
;          [:div.w-50.tracked-mega.h3-m [:span.f1.tracked-mega.f2-m "Maybe"] [:span.f1.tracked-mega.f2-m "Sheeps"]]
;          [:div.br3.bw2.ba.b--near-black.tc.avenir.near-white.bg-near-black.w-50.f4.pa3.lh-copy.fw2.vh-50.self-center.w-75-m.shadow-3.dn-m.justify-between
;           [:div.fw3.bb.bt.bw1.ma2.b--near-white. "A blog dedicated to *Functional Programming, and other niche and weird *tech things of my choosing."]
;           [:div.fw3.bb.bw1.ma2.b--near-white "Yes, the name is from the 'Maybe Not' Rich Hickey talk."]
;           [:div.f4.fw1.ba.bw1.ma2.b--near-white "* Manufactured on equipment that processes OOP: may contain imperative code & mutable state"]
;           [:div.f4.fw1.ba.bw1.ma2.b--near-white " * may contain non-tech related things because this is my blog and my code is law here. "]]]]))
  
(defn home-page []
  (fn []
    [:div.flex.flex-row.flex-between.flex-column-m.justify-around-m.b--near-black.bw2.bg-near-black.vh-100.mono-gf
     [:nav.w-30.items-center.flex.flex-column.justify-around.self-center.mt2.mb2.flex-column-m.justify-between-m.h-100-m.ma2.vh-100
      [posts-anchor]
      [portfolio-anchor]
      [github-anchor]
      [twitter-anchor]
      [about-anchor]
      [misc-anchor]]
     [:div#p-gram.w-100.tracked-mega.h3-m.bg-near-white.flex.flex-column.content-center.mt2 [:span#n-skew.m-sub.f-headline.tracked-mega.f2-m.fw1.b "Maybe"] [:span#n-skew.m-sub.f-headline.tracked-mega.f2-m "Sheeps"]]]))
