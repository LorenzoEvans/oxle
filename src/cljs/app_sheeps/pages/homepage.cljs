  
(ns app-sheeps.pages.homepage
    (:require [app-sheeps.subs]))

(defn home-page []
      (fn []
       [:div.flex.flex-column.justify-around.flex-column-m.justify-around-m.b--near-black.bw2.bg-image.vh-100
        [:h1.flex.flex-column.justify-center.w-100.w-90-m.flex-column-m.bw2.avenir.dark-gray.f1.ba.b--near-black.bw1.shadow-3.f2-m.tc.self-center 
         [:div.w-100.flex.flex-row.justify-between.tracked-mega [:span.f-headline.tracked-mega "Maybe"] [:span.f-headline.tracked-mega "Sheeps"]]]
        [:nav.w-100.items-center.flex.flex-row.justify-around.self-center.mt2.mb2.flex-column-m.justify-between-m.h-100-m
         [:a.h4.grow.avenir.no-underline.near-black.ba.bw2.f3.washed-green.bg-dark-gray.w4.br3.shadow-3.flex.items-center.justify-center {:href "https://github.com/LorenzoEvans"} "Github"]
         [:a.h4.grow.avenir.no-underline.near-black.ba.bw2.f3.washed-green.bg-dark-gray.w4.br3.shadow-3.flex.items-center.justify-center {:href "https://twitter.com/0xLEDev"} "Twitter"]
         [:a.h4.grow.avenir.no-underline.near-black.ba.bw2.f3.washed-green.bg-dark-gray.w4.br3.shadow-3.flex.items-center.justify-center {:href "#/posts"} "Posts"]
         [:a.h4.grow.avenir.no-underline.near-black.ba.bw2.f3.washed-green.bg-dark-gray.w4.br3.shadow-3.flex.items-center.justify-center {:href "#/misc"} "Misc"]
         [:a.h4.grow.avenir.no-underline.near-black.ba.bw2.f3.washed-green.bg-dark-gray.w4.br3.shadow-3.flex.items-center.justify-center {:href "#/about"} "About"]
         [:a.h4.grow.avenir.no-underline.near-black.ba.bw2.f3.washed-green.bg-dark-gray.w4.br3.shadow-3.flex.items-center.justify-center {:href "http://www.lorenzoevans.me/"} "Portfolio"]]
        [:div.flex.flex-column.br3.bw2.ba.b--near-black.tc.avenir.near-white.bg-near-black.f4.pa3.lh-copy.fw2.vh-50.self-center.w-75-m.shadow-3.dn-m.justify-between
         [:div.fw3.bb.bt.bw1.ma2.b--near-white. "A blog dedicated to *Functional Programming, and other niche and weird *tech things of my choosing."]
         [:div.fw3.bb.bw1.ma2.b--near-white "Yes, the name is from the 'Maybe Not' Rich Hickey talk."]
         [:div.f4.fw1.ba.bw1.ma2.b--near-white "* Manufactured on equipment that processes OOP: may contain imperative code & mutable state"]
         [:div.f4.fw1.ba.bw1.ma2.b--near-white " * may contain non-tech related things because this is my blog and my code is law here. "]]]))
  
