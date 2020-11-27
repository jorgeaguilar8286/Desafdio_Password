package com.example.desafio_password.Presenter;


import com.example.desafio_password.IPresenteView;
import com.example.desafio_password.model.Verifier;

public class Presenter {

    IPresenteView view;
    Verifier verifier;

    public Presenter(IPresenteView view) {
        this.view = view;
        verifier = new Verifier();
    }

    public void evaluatePass(final String pass)  {
        int res = verifier.evaluatePass(pass);

         switch (res) {
             case Verifier.weak:
                 this.view.showWeak();
                 break;
             case Verifier.medium:
                 this.view.showMedium();
                 break;
             case Verifier.strong:
                 this.view.showStrong();
                 break;
         }
    }
}
