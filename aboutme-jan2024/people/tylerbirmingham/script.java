<script>
// Change background color
document.getElementById('color').addEventListener('change', function() {
    document.body.style.backgroundColor = this.value;}

colorForm.addEventListener('change', function() {
    document.body.style.backgroundColor = colorSelect.value;
});
//random dog image from Dog API
document.getElementById('randomDogBtn').addEventListener('click', function() {
    fetch('https://dog.ceo/api/breeds/image/random')
        .then(response => response.json())
        .then(data => {
            const dogImage = data.message;
            document.getElementById('randomDogImage').src = dogImage;
        })
        .catch(error => console.error('Error fetching random dog:', error));
});
</script>