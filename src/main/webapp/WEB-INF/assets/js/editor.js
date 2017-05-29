/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 var htmEditor;
  var code;
                      $.getScript('//cdnjs.cloudflare.com/ajax/libs/ace/1.1.3/ace.js',function(){
                      $.getScript('//cdnjs.cloudflare.com/ajax/libs/ace/1.1.3/ext-language_tools.js',function(){
                      ace.require("ace/ext/language_tools");
                      htmEditor = ace.edit("htmEditor");
                      htmEditor.getSession().setMode();
                      htmEditor.setTheme("ace/theme/merbivore");
                      htmEditor.setShowPrintMargin(false);
                      htmEditor.setHighlightActiveLine(false);
                   
                      $('#run').on('click', function(event) {
                           code = htmEditor.getSession().getValue();
                            // console.log(code);
                          $.ajax({
                                url: "http://localhost:8080/test/run",
                                type: 'post',
                                data: JSON.stringify({
                                    text: code
                                }),
                                contentType: 'application/json',
                                dataType: 'json'
                                
                          }).done(function(response) {
                              response.message;
                              $('#Errorlog').html(response.message);
                              console.log(response);
                          });
                      });
                      
                      $('#clean').on('click',function(event){
                          $('#Errorlog').html("");
                          code = "";
                      });
                      
                  });
                });
             
