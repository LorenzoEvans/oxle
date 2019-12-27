  
(ns app-sheeps.pages.homepage
    (:require [app-sheeps.subs]))

(defn home-page []
      (fn []
       [:div.flex.flex-column.justify-around.w-80-m.flex-column-m.justify-around-m.b--near-black.bw2.bg-image
        [:h1.flex.flex-column.justify-center.w-100.w-90-m.flex-column-m.bw2.avenir.dark-gray.f1.ba.b--near-black.bw1.shadow-3.f2-m.hover-bg-dark-gray.hover-near-white.hover-animate.hover-near-black.grow.bg-animate.tc.self-center.dn-m "Maybe Sheeps"]
        [:nav.w-75.items-center.flex.flex-row.justify-between.self-center.mt2.mb2
         [:a.h4.link.dim.avenir.no-underline.near-black.ba.bw2.f3.washed-green.bg-dark-gray.w5.flex.items-center.justify-center {:href "https://github.com/LorenzoEvans"} "Github"]
         [:a.h4.link.dim.avenir.no-underline.near-black.ba.bw2.f3.washed-green.bg-dark-gray.w5.flex.items-center.justify-center {:href "https://twitter.com/0xLEDev"} "Twitter"]
         [:a.h4.link.dim.avenir.no-underline.near-black.ba.bw2.f3.washed-green.bg-dark-gray.w5.flex.items-center.justify-center {:href "#/posts"} "Posts"]
         [:a.h4.link.dim.avenir.no-underline.near-black.ba.bw2.f3.washed-green.bg-dark-gray.w5.flex.items-center.justify-center {:href "http://www.lorenzoevans.me/"} "Portfolio"]]
        [:div.flex.flex-column.bg-near-white.br3.bw2.ba.b--near-black.tc.avenir.navy.f4.pa3.lh-copy.fw2.vh-50.self-center.w-75-m.shadow-3.dn-m.justify-between
         [:div.fw3.bb.bt.bw1.ma2.b--near-black. "A blog dedicated to *Functional Programming, and other niche and weird *tech things of my choosing."]
         [:div.fw3.bb.bw1.ma2.b--near-black "Yes, the name is from the 'Maybe Not' Rich Hickey talk."]
         [:div.f4.fw1.ba.bw1.ma2.b--near-black "* Manufactured on equipment that processes OOP: may contain imperative code & mutable state"]
         [:div.f4.fw1.ba.bw1.ma2.b--near-black " * may contain non-tech related things because this is my blog and my code is law here. "]]]))
  
