(ns app-sheeps.views
  (:require
   [re-frame.core :as re-frame]
   [app-sheeps.subs :as subs]
   [app-sheeps.pages.homepage :refer [home-page]]
   [app-sheeps.pages.about :refer [about-page]]
   [app-sheeps.pages.post :refer [post-page]]
   [app-sheeps.pages.posts :refer [posts-page]]
   [app-sheeps.pages.misc :refer [misc-page]]
   ))


;; home

; (defn home-panel []
;   (let [name (re-frame/subscribe [::subs/name])]
;     [:div
;      [:h1 (str "0xle :: Blog")]

;      [:div
;       [:a {:href "#/about"}
;        "go to About Page"]
;       [:a {:href "#/how-fp"} "how fp"]]
;      ]))
(defn home-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    (fn []
    [:div.w-75.flex.flex-column.justify-around.w-80-m.flex-column-m.justify-around-m.b--near-black.bw2.ma4
     [:nav.flex.flex-row.w-100.h5.flex-column-m.h-20.items-center
      [:h1.flex.flex-column.justify-center.w-75.ml1.w-90-m.flex-column-m.bw2.avenir.dark-gray.f-subheadline.ba.b--near-black.bw2.mb2.mr4.shadow-3.f2-m.hover-bg-dark-gray.hover-near-white.hover-animate.hover-near-black.grow.bg-animate.tc.self-center.dn-m "Maybe Sheeps"]
      [:a.h2.link.dim.avenir.no-underline.near-black.ba.bw1.b--navy.w5.tc.pa1.ma2.self-center {:href "https://github.com/LorenzoEvans"} "Github"]
      [:a.h2.link.dim.avenir.no-underline.near-black.ba.bw1.b--navy.w5.tc.pa1.ma2.self-center {:href "https://twitter.com/0xLEDev"} "Twitter"]
      [:a.h2.link.dim.avenir.no-underline.near-black.ba.bw1.b--navy.w5.tc.pa1.ma2.self-center {:href "/posts"} "Posts"]
      [:a.h2.link.dim.avenir.no-underline.near-black.ba.bw1.b--navy.w5.tc.pa1.ma2.self-center {:href "http://www.lorenzoevans.me/"} "Portfolio"]]
     [:div.flex.flex-column.bg-near-white.br3.bw2.ba.b--near-black.w-50.tc.avenir.navy.f4.pa3.lh-copy.fw2.h-60.self-center.w-75-m.shadow-3.dn-m
      [:div.fw3.bb.bt.bw1.ma2.b--near-black. "A blog dedicated to *Functional Programming, and other niche and weird *tech things of my choosing."]
      [:div.fw3.bb.bw1.ma2.b--near-black "Yes, the name is from the 'Maybe Not' Rich Hickey talk."]
      [:div.f5.fw1.ba.bw1.ma2.b--near-black "* Manufactured on equipment that processes OOP: may contain imperative code & mutable state"
       [:div.f5.fw1.ba.bw1.ma2.b--near-black " * may contain non-tech related things because this is my blog and my code is law here. "]]]])))

;; about

(defn about-panel []
  [:div
   [:h1 "This is the About Page."]

   [:div
    [:a {:href "#/"}
     "go to Home Page"]]])

(defn how-fp []
  [:h1 "Posts"])
;; main

(defn- panels [panel-name]
  (case panel-name
    :home-panel [home-panel]
    :about-panel [about-panel]
    :posts-panel [posts-page]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [show-panel @active-panel]))
