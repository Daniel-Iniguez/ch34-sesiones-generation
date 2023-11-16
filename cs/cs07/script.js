const refTitle = getReferenceTitle();

        function changeText(){
            console.log(refTitle);
            console.log(typeof refTitle);
            refTitle.innerHTML = "Me llamo <em><strong>D</strong></em>";
        }
        
        function changeColorOfReference(reference, color){
            reference.style.color = color;
        }
        
        function changeColorHandler(color){
            changeColorOfReference(refTitle,color);
        }

        function changeColorToWhite(element){
            console.log(element);
            changeColorOfReference(element,'white');
        }


        function getReferenceTitle(){
            return document.getElementById("principal-title");
        }

        function resetText(){
            const refText = document.getElementsByClassName('description');
            console.log(refText);
            for(let i = 0; i<refText.length; i++){
                changeColorOfReference(refText[i],'black')
            }
        }