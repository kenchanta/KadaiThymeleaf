package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//入力画面の初期表示をする
@Controller
public class InputController2 {

    @GetMapping("/input")
    //required = false は、このクエリパラメータがリクエストに含まれていなくてもエラーにならないように指定＝previous パラメータがない場合でもメソッドが実行される。
    public String getInput(@RequestParam(name="previous", required=false) String previous, Model model) {
        if(previous != null){
            model.addAttribute("previous", previous);
        }
        return "input";
    }
}